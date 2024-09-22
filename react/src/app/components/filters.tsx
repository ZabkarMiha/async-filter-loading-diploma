"use client";

import { useEffect, useState } from "react";
import { Root } from "@/app/interfaces/json-structure";

const Filters = () => {
    const [data, setData] = useState<Root | null>(null);

    useEffect(() => {
        const fetchData = async () => {
            const response = await fetch('/api/get-filters');
            const filtersData: Root = await response.json();
            setData(filtersData);
        };
        fetchData();
    }, []);

    if (!data) return <div>Loading...</div>;

    return (
        <div>
            <h1>Filters</h1>
            {data.value.facetGroups.map((group) => (
                <div key={group.id}>
                    <h2>{group.name}</h2>
                    <ul>
                        {group.facets.map((facet) => (
                            <li key={facet.value}>{facet.text}</li>
                        ))}
                    </ul>
                </div>
            ))}
        </div>
    );
};

export default Filters;
